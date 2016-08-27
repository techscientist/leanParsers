import java.util.ArrayList;

class RootModel {

	public int id;
	public String code_of_conduct;
	public String privacy;
	public String topic;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public String end_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String organizer_description;
	public String type;

	public RootModel(int id, String code_of_conduct, String privacy, String topic, String name, String logo, String schedule_published_on, String state, VersionModel version, Call_for_papersModel call_for_papers, String email, String start_time, String end_time, String location_name, ArrayList<Social_linksModel> social_links, String background_image, CopyrightModel copyright, String timezone, String description, String organizer_name, CreatorModel creator, String organizer_description, String type) {

		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.topic = topic;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.type = type;

	}

}