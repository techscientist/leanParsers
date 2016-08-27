import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public String location_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String background_image;
	public String email;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public int id;
	public String end_time;
	public String organizer_description;
	public String name;
	public String privacy;
	public VersionModel _version;
	public String logo;
	public String state;
	public CreatorModel _creator;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, String location_name, String timezone, CopyrightModel copyright, String organizer_name, String background_image, String email, String start_time, String code_of_conduct, String type, int id, String end_time, String organizer_description, String name, String privacy, VersionModel version, String logo, String state, CreatorModel creator, String description) {

		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.location_name = location_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.id = id;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this.logo = logo;
		this.state = state;
		this._creator = creator;
		this.description = description;

	}

}