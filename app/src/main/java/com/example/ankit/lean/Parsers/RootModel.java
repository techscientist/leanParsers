import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CreatorModel _creator;
	public String timezone;
	public String background_image;
	public VersionModel _version;
	public String name;
	public String description;
	public String privacy;
	public String end_time;
	public String email;
	public String schedule_published_on;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String type;
	public String state;
	public CopyrightModel _copyright;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String topic;

	public RootModel(String logo, Call_for_papersModel call_for_papers, int id, CreatorModel creator, String timezone, String background_image, VersionModel version, String name, String description, String privacy, String end_time, String email, String schedule_published_on, String code_of_conduct, ArrayList<Social_linksModel> social_links, String location_name, String type, String state, CopyrightModel copyright, String start_time, String organizer_description, String organizer_name, String topic) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._creator = creator;
		this.timezone = timezone;
		this.background_image = background_image;
		this._version = version;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.end_time = end_time;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.location_name = location_name;
		this.type = type;
		this.state = state;
		this._copyright = copyright;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}