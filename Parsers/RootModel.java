import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String logo;
	public String type;
	public String privacy;
	public String description;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public String code_of_conduct;
	public String timezone;
	public String state;
	public String name;
	public String location_name;
	public String end_time;
	public String organizer_description;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, CreatorModel creator, String organizer_name, VersionModel version, int id, String start_time, ArrayList<Social_linksModel> social_links, String email, String logo, String type, String privacy, String description, String topic, String schedule_published_on, String background_image, String code_of_conduct, String timezone, String state, String name, String location_name, String end_time, String organizer_description) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;
		this.logo = logo;
		this.type = type;
		this.privacy = privacy;
		this.description = description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;
		this.name = name;
		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;

	}

}