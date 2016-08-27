import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String location_name;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public String type;
	public String email;
	public CreatorModel _creator;
	public VersionModel _version;
	public String privacy;
	public String logo;
	public String end_time;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public String topic;
	public String name;

	public RootModel(Call_for_papersModel call_for_papers, String background_image, String location_name, String start_time, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, String description, String organizer_description, String type, String email, CreatorModel creator, VersionModel version, String privacy, String logo, String end_time, String state, CopyrightModel copyright, String organizer_name, String code_of_conduct, String timezone, String topic, String name) {

		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.type = type;
		this.email = email;
		this._creator = creator;
		this._version = version;
		this.privacy = privacy;
		this.logo = logo;
		this.end_time = end_time;
		this.state = state;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.topic = topic;
		this.name = name;

	}

}