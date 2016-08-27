import java.util.ArrayList;

class RootModel {

	public String logo;
	public String end_time;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public String name;
	public String type;

	public RootModel(String logo, String end_time, String topic, CopyrightModel copyright, String start_time, VersionModel version, String organizer_name, int id, String state, Call_for_papersModel call_for_papers, String timezone, String code_of_conduct, String description, String location_name, String email, String privacy, ArrayList<Social_linksModel> social_links, String schedule_published_on, CreatorModel creator, String background_image, String organizer_description, String name, String type) {

		this.logo = logo;
		this.end_time = end_time;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;

	}

}